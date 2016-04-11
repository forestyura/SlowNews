$(function(){
    setInterval(function () {
        var req = new XMLHttpRequest();
        req.open('GET', '/weather', true);
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
    }, 10000)

    $("nav.site-navigation").click(function (event) {
        history.replaceState({foo: 'bar'}, event.target.textContent + " Page", '/' + event.target.textContent.toLowerCase());
        document.getElementById("page-title").innerHTML = event.target.textContent + " Page";
        $.get("/" + event.target.textContent.toLowerCase(), function(data){
        });
        event.preventDefault();

    })


});

