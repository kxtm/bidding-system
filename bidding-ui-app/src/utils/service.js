import axios from "axios";

const  service=axios.create({
    baseURL:'http://localhost:8080',
    timeout:1000,
    headers:{'token':''}
});
export default  service;