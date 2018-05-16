var stringBuild = "";

function documentPass(document){
    var regPlate = document.getElementById('regPlate').value;
    var yearRegistered = parseInt(document.getElementById('yearRegistered').value);
    var emissions =  parseInt(document.getElementById('emissions').value);

    regPlateCheck(regPlate);
    yearCheck(yearRegistered);
    emissionCheck(emissions);
    writeToFile([regPlate,yearRegistered,emissions]);

    alert(stringBuild);
    stringBuild = "";
}

function regPlateCheck(regPlate){
    var regPlateUpperCase = regPlate.toString().toUpperCase();
    var strLength = regPlate.toString().length;
    var validVRM = "Valid VRM";
    var invalidVRM = "Invalid VRM";

    stringBuild += (regPlateUpperCase + "\n");

    if (strLength > 8 || strLength < 4){stringBuild += validVRM}
    else { stringBuild += invalidVRM; }
}

function yearCheck(year){
    if (year > 2018){
        alert("JOKER");
    }
}

function emissionCheck(emissions){
    if (emissions < 100){alert("Free");}
    if (emissions > 100 && emissions < 1000){alert("what kinda car u got to do that");}
    if (emissions > 1000){alert("Pickup Truck?")}
}


function writeToFile(text) {
    var fso = new ActiveXObject("Scripting.FileSystemObject");
    var fh = fso.OpenTextFile("fileGeneration/data.txt", 8, false, 0);
    fh.WriteLine(text);
    fh.Close();
}