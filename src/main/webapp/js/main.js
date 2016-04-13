$(function(){
    switch (document.location.pathname) {
        case '/news' :
            goToLink("News");
            break;
        case '/archive' :
            goToLink("Archive");
            break;
        case '/login' :
            goToLink("Login");
            break;
        case '/registration' :
            goToLink("Registration");
            break;
        default:
            goToLink("News");
            break;
    }

    function goToLink(link) {
        document.getElementById("page-title").innerHTML = link + " Page";
        $.get("/view/" + link.toLowerCase(), function(data){
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    }

    setInterval(function () {
        var req = new XMLHttpRequest();
        req.open('GET', '/view/weather', true);
        req.onreadystatechange = function (aEvt) {
            if (req.readyState == 4) {
                if(req.status == 200) {
                    console.log("Weather Updated");
                    document.getElementById("weather").innerHTML = req.responseText;
                }

                else {
                    console.log("Error loading page\n");
                }
            }
        };
        req.send(null);
    }, 10000);

    $(document).on("click", "nav.site-navigation", function (event) {
        
        history.replaceState({foo: 'bar'}, event.target.textContent + " Page", '/' + event.target.textContent.toLowerCase());
        document.getElementById("page-title").innerHTML = event.target.textContent + " Page";
        $.get("/view/" + event.target.textContent.toLowerCase(), function(data){
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();

    });
    
    $(document).on("click", "button#login-button", function (event) {
        var formData = {
            'username': $('input[name=username]').val(),
            'password': $('input[name=password]').val()
        };

        $.post("/view/login", formData, function(data) {
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    })

    $(document).on("click", "button#registration-button", function (event) {
        var formData = {
            'username': $('input[name=username]').val(),
            'e-mail': $('input[name=e-mail]').val(),
            'password': $('input[name=password]').val(),
            'confirm-password': $('input[name=confirm-password]').val()
        };

        $.post("/view/registration", formData, function(data) {
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    })
    
    $(document).on("click", "button#logout-button", function (event) {
        $.post("/view/logout",  function(data) {
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    })

    $(document).on("click", "button#add-to-archive", function (event) {
        var formData = {
            'title': $('input[name=title]').val(),
            'description': $('input[name=description]').val(),
            'image': $('input[name=image]').val(),
            'pubDate': $('input[name=pubDate]').val()
        };

        $.post("/view/news", formData, function(data) {
        });
        event.preventDefault();
    })
});

