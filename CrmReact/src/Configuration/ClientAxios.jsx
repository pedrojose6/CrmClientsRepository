import axios from "axios";

const clientAxios = axios.create({
    baseURL: "http://localhost:8080/"
})

export default clientAxios