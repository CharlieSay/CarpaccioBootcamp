function processOrder(document) {
     var firstName = document.getElementById('firstName').value
     var secondName = document.getElementById('secondName').value
     var email = document.getElementById('emailAddress').value
     var phoneNumber = document.getElementById('phoneNumber').value
     var orderContentsGold = document.getElementById('goldOrder').value
     var orderContentsSilver = document.getElementById('silverOrder').value
     var orderContentsBronze = document.getElementById('bronzeOrder').value
    fetch('http://localhost:8080/orderform' +
        '?firstName=' + firstName +
        '&secondName='+secondName+
        '&emailAddress='+email+
        '&phoneNumber='+phoneNumber+
        '&goldQuantity='+orderContentsGold+
        '&silverQuantity='+orderContentsSilver+
        '&bronzeQuantity='+orderContentsBronze,{
        method: "POST",
        headers: {
            Accept: "application/json",
            "Content-Type": "application/json"
        },
    });
     clearPage(document.getElementById('firstName'))
     clearPage(document.getElementById('secondName'))
     clearPage(document.getElementById('emailAddress'))
     clearPage(document.getElementById('phoneNumber'))
     clearPage(document.getElementById('goldOrder'))
     clearPage(document.getElementById('silverOrder'))
     clearPage(document.getElementById('bronzeOrder'))
}

function clearPage(clear){
    clear.value = ''
}