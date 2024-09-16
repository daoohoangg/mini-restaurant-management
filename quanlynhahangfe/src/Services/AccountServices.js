import axios from "axios";

const ACCOUNT_API_BASE_URL = "http://localhost:8090/accounts/"

class AccountServices {
    getAccount(){
        return axios.get(ACCOUNT_API_BASE_URL);
    }

    createAccount(){
        return axios.post(ACCOUNT_API_BASE_URL);
    }
    findAccountById(){
        return axios.get(ACCOUNT_API_BASE_URL);
    }
    updateAccount(){
        return axios.put(ACCOUNT_API_BASE_URL);
    }
    deleteAccount(){
        return axios.delete(ACCOUNT_API_BASE_URL);
    }
}

export default new AccountServices;