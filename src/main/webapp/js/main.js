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
        console.log(event.target.textContent);
        history.pushState({foo: 'bar'}, 'event.target.textContent', '/' + event.target.textContent);
        event.preventDefault();

    })


});

