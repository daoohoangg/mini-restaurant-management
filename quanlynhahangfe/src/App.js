import logo from './logo.svg';
import './App.css';
import UserList from './Component/Account';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import ViewsAccount from './Component/ViewsAccount.js'
import CreateAccount from './Component/CreateAcconut.jsx'

function App() {
  return (
    <div>
      <Router>
        <div className='container'>
          <Routes>
            <Route path = "/" component = {ViewsAccount}></Route>
            <Route path = "/accounts/views" component = {ViewsAccount}></Route>
            <Route path = "/accounts/findbyids"></Route>
            <Route path = "/accounts/addaccount" component = {CreateAccount}></Route>
            <Route path = "/accounts/deletaccount"></Route>
            <Route path = "/accounts/changepassword"></Route>
          </Routes>
          
        </div>
      </Router>
    </div>
  )
}

export default App;
