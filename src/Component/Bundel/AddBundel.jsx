import React from "react";
import { Form, Button, InputGroup, FormControl, Jumbotron} from 'react-bootstrap';
import './bundel.css'
// import axios from  'axios';
// import { withRouter } from "react-router";

function AddBundel(props){
    // const handleSubmitClick = (e) => {
    //     e.preventDefault();
    //     let object = {};
    //     let formData=new FormData(e.target);
    //     formData.forEach((value,key)=>{
    //         object[key] = value;
            
    //     }
    //     );
    //     console.log(object);
    //     let json = JSON.stringify(object); 
    //     console.log(json); 


    //     const config = {     
    //         headers: { 'content-type' : "application/json" }
    //     }

        // axios.post('http://localhost:8080/StockManagement/company/register', json,config).then((response)=>{
        //      console.log(response);
        //    })
        //    .catch((error)=>{
        //      console.log(error);
        //   });
        //   props.history.push("/AddCompany");

        // }
        return (
            
            <div className="col-md-4 offset-4 card card-body mt-5">
                
                <form >
                    <h3>Add Bundel</h3>

                    <div className="form-group">
                        <label> Bundel Name</label>
                        <input type="text" className="form-control" name="userName"  placeholder="enter your full name"  required/>
                    </div>

                    <div className="form-group">
                        <label>Bundel Decription</label>
                        <input type="number" className="form-control" name="phone" placeholder="enter your mobile number" />
                    </div>

                    <div className="form-group">
                        <label>plan Id</label>
                        <input type="number" className="form-control" name="product" placeholder="Enter product Id"  required/>
                    </div>  
                   <br></br>
                    
                <div>
                    <Button variant="outline-primary mr-5" type="submit" >Add </Button>{' '}
                     <Button variant="outline-danger mr-5" className="offset-4 " type= "reset">cancel</Button>{' '}
                    </div>

                </form>
            </div>
     
        );
    }

export default AddBundel;