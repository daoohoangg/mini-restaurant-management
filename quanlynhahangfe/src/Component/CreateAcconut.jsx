import React from "react";
const CreateAccount = (value) =>{
    const errors = {};
    if(!value.username){
        errors.username = "Must be fill up";
    }
    if(!value.password){
        errors.password = "Must be fill up";
    }
    
}
// const LoginFrom = (props) => {
//     const()
// }

export default CreateAccount;
