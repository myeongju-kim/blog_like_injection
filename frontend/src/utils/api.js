import axios from 'axios'

const api = axios.create({
  baseURL: 'http://localhost:8080/',
})

export const $apiGet = (url, params = {}) => {
  return api
    .get(url, { params })
    .then(response => response.data)
    .catch(error => {
      throw error
    })
}

export const $apiPost = (url, data = {}) => {
  return api
    .post(url, data)
    .then(response => response.data)
    .catch(error => {
      throw error
    })
}