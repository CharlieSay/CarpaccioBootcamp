function getIP(ipAddress) {
    fetch('http://localhost:8080/' +
        '?ipAddress=' + ipAddress, {
        method: "POST",
        headers: {
            Accept: "application/json",
            "Content-Type": "application/json"
        },
    });
}