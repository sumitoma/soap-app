let xmlParser  = require('fast-xml-parser');
let restClient = require('axios');
const wsdlUrl = 'http://localhost:8080/?wsdl';
restClient.get(wsdlUrl)
.then(response => {
    if(response.status == 200){
        const wsdl = response.data;
        const wsdlObj = xmlParser.parse(wsdl);
        console.log(wsdlObj);
    } else {
        console.log("Failed to fetch wsdl document");
    }
});