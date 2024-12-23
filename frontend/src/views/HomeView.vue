<script setup>
import SearchComponent from '@/components/SearchComponent.vue';
import TableComponent from '@/components/TableComponent.vue';
import { $apiGet } from '@/utils/api';
import {ref} from 'vue'

const totalCount = ref(0);
const products = ref([]);

const search = async (productName) => {
  if(productName == undefined){
    productName = '';
  }

  await $apiGet("/products", { productName })
    .then(res => {
      totalCount.value = res.totalCount;
      products.value = res.products;
    })
    .catch(err => alert(err.message))
}
</script>

<template>
  <SearchComponent @search=search></SearchComponent>
  <TableComponent 
  :total-count="totalCount"
  :products="products"
  ></TableComponent>
</template>

<style>
</style>
