import service from "@/utils/service";

export function login(login){
    return service({url:"/user/login", method:"post", login});
}