<template id="root-page">
  <div>
    Content that never updates
    <first-page v-if="path === '/first-page'"></first-page>
    <second-page v-if="path === '/second-page'"></second-page>
    <third-page v-if="path === '/third-page'"></third-page>
  </div>
</template>
<script>
Vue.component("root-page", {
  template: "#root-page",
  data: () => ({
    softPath: null,
  }),
  computed: {
    path() {
      return this.softPath || location.pathname
    },
  },
  created() {
    document.addEventListener("click", (event) => {
      if (event.target.tagName === "A") {
        event.preventDefault();
        const destinationURL = event.target.getAttribute("href");
        this.softPath = destinationURL;
        window.history.pushState(null, null, destinationURL);
      }
    });
    setInterval(() => this.softPath = location.pathname, 10);
  }
});
</script>
