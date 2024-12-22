<script setup>

</script>

<template>
  <VTable>
    <thead>
      <tr>
        <th>#</th>
        <th>Name</th>
        <th>Age</th>
        <th>Country</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1</td>
        <td>John Doe</td>
        <td>28</td>
        <td>USA</td>
      </tr>
      <tr>
        <td>2</td>
        <td>Jane Smith</td>
        <td>34</td>
        <td>Canada</td>
      </tr>
      <tr>
        <td>3</td>
        <td>Samuel Green</td>
        <td>25</td>
        <td>UK</td>
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
</style>
