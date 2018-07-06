function orderFormLoad() {
    $(document).ready(function() {
        $('#orderNumber').hide();
        $('#submit').prop('disabled', true);
    });
    document.getElementById("bronzeOrder").addEventListener("click", checkContents);
    document.getElementById("silverOrder").addEventListener("click", checkContents);
    document.getElementById("goldOrder").addEventListener("click", checkContents);
    document.getElementById("phoneNumber").addEventListener("click", checkContents);
    document.getElementById("emailAddress").addEventListener("click", checkContents);
    document.getElementById("secondName").addEventListener("click", checkContents);
    document.getElementById("firstName").addEventListener("click", checkContents);
}

function checkContents() {
    if ($('#firstName').length > 0 && $('#secondName').length > 0 && $('#emailAddress').length > 0
        && $('#phoneNumber').length > 0){
        $('#submit').prop('disabled', false);
    }else{
        $('#submit').prop('disabled', true);
    }
}

function processOrder(document) {
    var firstName = document.getElementById('firstName').value;
    var secondName = document.getElementById('secondName').value;
    var email = document.getElementById('emailAddress').value;
    var phoneNumber = document.getElementById('phoneNumber').value;
    var orderContentsGold = document.getElementById('goldOrder').value;
    var orderContentsSilver = document.getElementById('silverOrder').value;
    var orderContentsBronze = document.getElementById('bronzeOrder').value;
    fetch('http://localhost:8080/orderform'
        + '?firstName=' + firstName
        + '&secondName=' + secondName
        + '&emailAddress=' + email
        + '&phoneNumber=' + phoneNumber
        + '&goldQuantity=' + orderContentsGold
        + '&silverQuantity=' + orderContentsSilver
        + '&bronzeQuantity=' + orderContentsBronze, {
        method: "POST",
        headers: {
            Accept: "application/json",
            "Content-Type": "application/json"
        }
    }).then(function(a) {
        return a.json(); // call the json method on the response to get JSON
    }).then(function(json) {
        removeJson(json)
    });
    clearPage();
}

function removeJson(json) {
    var stringJson = json.orderNumber;
    console.log(stringJson);
    document.getElementById('orderNumber').innerText = "Order Number : " + stringJson;
}

function clearPage() {
    document.getElementById('firstName').value = '';
    document.getElementById('secondName').value = '';
    document.getElementById('emailAddress').value = '';
    document.getElementById('phoneNumber').value = '';
    document.getElementById('goldOrder').value = '0';
    document.getElementById('silverOrder').value = '0';
    document.getElementById('bronzeOrder').value = '0';
    $('#submit').prop('disabled', true);
    $('#orderNumber').fadeIn('slow');
    stateChange()
}

function stateChange() {
    setTimeout(function() {
        $('#orderNumber').fadeOut('slow');
    }, 5000);
}