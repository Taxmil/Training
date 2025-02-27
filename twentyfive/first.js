import React from 'react';
import ReactDOM from 'react-dom/client';

function Divisible(){
    return <h1>It is divisible</h1>
}
function Notdivisible(){
    return <h1>IT is not divisible</h1>
}
function Checknum(props){
    const a= props.num;
    if (a%13==0){
        return <Divisible/>
    }
    return <Notdivisible/>
}
 
const root= ReactDOM.createRoot(document.getElementById('root'));
root.render(<Checknum num="763466"/>);
    