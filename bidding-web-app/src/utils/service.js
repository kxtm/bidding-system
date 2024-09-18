import axios from "axios";
import {getToken} from "@/utils/auth";

const  service=axios.create({
    baseURL:'http://localhost:8080',
    timeout:6000
});
//请求前处理
service.interceptors.request.use(config=>{
    const token=getToken();
    if(token){
        config.headers['Author']=token;
    }
    return config;
},error => {return Promise.reject(error)});

//响应处理
service.interceptors.response.use(resp=>{
    return resp.data;
},error => {return Promise.reject(error)});
export default  service;