function modifyString(str)
{
//fill code here
return str.toLowerCase().split(' ').join('');
}

function uniqueCharacters(str)
{
//fill code here
let newString = modifyString(str);
let outputString="";
    for(let i=0;i<newString.length;i++){
        if(outputString.includes(newString[i]) === false){
            outputString+=newString[i];
        }
    }
    return outputString;
}  

