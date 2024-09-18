import Cookies from "js-cookie";

const tkey = 'Auth';

export function getToken() {
    return Cookies.get(tkey);
}
export function setToken(token) {
    return Cookies.set(tkey, token);
}
export function removeToken() {
    return Cookies.remove(tkey);
}