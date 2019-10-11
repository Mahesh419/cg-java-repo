const http = require('http');
const keepAliveAgent = new http.Agent({ keepAlive: true });

const BRANCH_FILE = './branch.txt';
const UNIT_TEST_RESULT_PATH = './results.json';

const unitTest = require(UNIT_TEST_RESULT_PATH);
const lineReader = require('line-reader');

const getBranchName = (filePath) => {
    return new Promise((resolve, reject) => {
        lineReader.eachLine(filePath, line => {
            resolve(line);
        }) 
    });
};

const postData = async () => {
    const branchName = await getBranchName(BRANCH_FILE);
    const params = {
        branchName,
        unitTest
    };
    return params;
};

const sendReportData = async () => {
  /*const data = await postData();
  const options = {
    hostname: 'd3s6yky9vet5yl.cloudfront.net',
    path: '/session/report',
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
      'Content-Length': Buffer.byteLength(JSON.stringify(data))
    }
  };
  
  const req = http.request(options, (res) => {});  
  
  req.write(JSON.stringify(data));
  req.end();*/
  console.log('result js file');
};

sendReportData();
  
 