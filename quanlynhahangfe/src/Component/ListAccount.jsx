import React, { Component } from "react";
import AccountServices from "../Services/AccountServices";

class ListAccountComponent extends Component(){
    constructor(props){
        super(props);
        this.state ={
            account : []
        }
        this.addAccount = this.addAccount.bind(this);
        this.editAccount = this.editAccount.bind(this);
        this.deleteAccount =this.deleteAccount.bind(this);
    }
    deleteAccount(id){
        AccountServices.deleteAccount(id).then( res => {
            this.setState({accounts: this.state.accounts.filter(acc => acc.id !== id)});
        });
    }
    viewAccount(id){
        this.props.history.push(`/view-employee/${id}`);
    }
    editAccount(id){
        this.props.history.push(`/add-employee/${id}`);
    }
    componentDidMount(){
        AccountServices.getAccount().then((res) => {
            this.setState()
        })
    }
    addAccount(){
        this.props.history.push('/add-account')
    }
    render(){
        return(
            <div>
                <h2 className="">Accounts List</h2>
                <div className="row">
                    <button className="" onClick={this.addAccount}>Add an account</button>
                </div>
                <br></br>
                <div className="row">
                    <table className="table">
                        <thead>

                        <tr>
                            <th>User Name</th>
                            <th>PassWord</th>
                            <th>Address</th>
                            <th></th>
                        </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.accounts.map(
                                    account => 
                                    <tr key={account.id}>
                                        <td>{account.username}</td>
                                        <td>{account.password}</td>
                                        <td>{account.address}</td>
                                        <td>
                                            <button onClick={ () => this.editEmployee(account.id)} className="">Update </button>
                                            <button style={{marginLeft: "10px"}} onClick={ () => this.deleteEmployee(account.id)} className="">Delete </button>
                                            <button style={{marginLeft: "10px"}} onClick={ () => this.viewEmployee(account.id)} className="">View </button>
                                        </td>
                                    </tr>
                                )
                            }
                        </tbody>
                        
                    </table>
                </div>
            </div>
        )
    }
}

export default ListAccountComponent;