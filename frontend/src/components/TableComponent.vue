<script setup>
import { defineProps } from 'vue';

const props = defineProps({
  totalCount: Number,
  products: Array,
});
</script>

<template>
  <h4>검색 결과: <span class="text-blue">{{ props.totalCount ?? 0 }}개</span></h4>
  <VTable>
    <thead>
      <tr>
        <th>순번</th>
        <th>상품코드</th>
        <th>상품명</th>
        <th>수량</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="(item, index) in props.products"
       :key="item.productId">
        <td>{{ index + 1 }}</td>
        <td>{{ item.productCode }}</td>
        <td>{{ item.productName }}</td>
        <td>{{ item.quantity }}</td>
      </tr>
    </tbody>
  </VTable>
</template>

<style scoped>
thead {
  background-color: #f5f5f5;
  font-weight: bold;
}

th, td {
  padding: 10px;
  text-align: left;
  border-bottom: 1px solid #ddd; 
}

tbody tr:hover {
  background-color: #f0f0f0;
}
h4{
  margin: 2px 2px 2px 2px
}
.text-blue{
  color: rgb(87, 87, 245)
}
</style>
