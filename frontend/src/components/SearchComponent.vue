<script setup>
import { ref, defineEmits } from 'vue';

const emit = defineEmits(['search'])
let productName = ref('')
</script>

<template>
  <VRow class='search'>
    <VTextField
      v-model="productName"
      variant="outlined"
      placeholder="상품이름"
      density="compact"
    ></VTextField>
    <VBtn class="search-button" @click="emit('search', productName.value)"> 🔍 </VBtn>
  </VRow>
</template>

<style scoped>
.search{
    margin: 10px 10px 10px 10px
}
.search-bar {
  max-width: 500px;
  margin: 20px auto;
  background-color: #f9f9f9;
  border-radius: 8px;
  padding: 10px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}


.search-button {
    margin-left: 20px;
    background-color: rgb(206, 204, 204);
    font-size: 20px;
}
</style>
