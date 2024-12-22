<script setup>
import SearchComponent from '@/components/SearchComponent.vue';
import TableComponent from '@/components/TableComponent.vue';
import { $apiGet } from '@/utils/api';
import {ref} from 'vue'

const productList = ref([]);

const search = async (productName) => {
  await $apiGet('/products', productName)
    .then(res => {
      productList.value = res.data.productList
    })
    .catch(err => alert(err.message))
}
</script>

<template>
  <SearchComponent @search=search></SearchComponent>
  <TableComponent></TableComponent>
</template>

<style>
</style>
