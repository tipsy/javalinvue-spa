<template id="second-page">
  <div>
    <h1>Second page</h1>
    <a href="/first-page">Go to first page</a>
    <a href="/second-page">Go to second page</a>
    <a href="/third-page">Go to third page</a>
  </div>
</template>
<script>
Vue.component("second-page", {
  template: "#second-page",
});
</script>
