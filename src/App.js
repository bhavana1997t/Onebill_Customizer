import logo from './logo.svg';
import './App.css';
import NavbarComponent from './Component/NavbarComponent.jsx';
import HomePage from './Component/HomePage';
import RenderComponent from './Component/RenderComoonent'

function App() {
  return (
    <div className="App">
     <NavbarComponent/>
     <RenderComponent/>
    </div>
  );
}

export default App;
