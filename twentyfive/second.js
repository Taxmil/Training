import React from 'react';
import ReactDOM from 'react-dom/client';

function Even(){
    return <h1>The length of the word is Even </h1>
}
function Odd(){
    return <h1>The leght of the word is odd</h1>
}
function Checkstring(props){
    const a= props.str;
    b=a.length;
    if (b%2==0){
        return <Even/>
    }
    return <Odd/>
}
 
const root= ReactDOM.createRoot(document.getElementById('root'));
root.render(<Checkstring str="fjhsd"/>);
    
    

