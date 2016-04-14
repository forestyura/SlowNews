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
    }, 600000);

    $(document).on("click", "nav.site-navigation", function (event) {
        
        history.replaceState({foo: 'bar'}, event.target.textContent + " Page", '/' + event.target.textContent.toLowerCase());
        document.getElementById("page-title").innerHTML = event.target.textContent + " Page";
        $.get("/view/" + event.target.textContent.toLowerCase(), function(data){
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();

    });
    
    $(document).on("click", "button#login-button", function (event) {
        $.post("/view/login", $(event.target.form).serialize(), function(data) {
            document.getElementById("page-content").innerHTML = data;
        });
        event.preventDefault();
    })

    $(document).on("click", "button#registration-button", function (event) {
        $.post("/view/registration",$(event.target.form).serialize(), function(data) {
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
        $.post("/view/news", $(event.target.form).serialize(), function(data) {
        });
        event.preventDefault();
    })
});

