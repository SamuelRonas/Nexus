<template>
  <div>
    <header class="banner" id="home">
      <div class="header">
        <div class="navigators">
          <button @click="scrollTo('home')">Home</button>
          <button @click="scrollTo('about')">About me</button>
          <button @click="scrollTo('code')">Code</button>
          <button @click="scrollTo('team')">Team</button>
        </div>
        <button class="signup"> Sign up</button>

      </div>



    </header>

    <!-- Sobre mim -->
    <section class="about" id="about">
      <div class="text-about">
        <h1 class="slogan">Nexus between what matters.</h1>
        <p>
          The idea came from the need for a place to have all your files, cards, notes and everything you want always
          with you, no matter the device or time, you needed something to just open the Nexus.
        </p>
      </div>
      <div class="image-block">
        <img src="../../public/img/element_glass_box.png" />
      </div>

    </section>

    <!-- Serviços ou Portfólio -->
    <section class="code" id="code">
      <h2>O que eu faço</h2>
      <div class="grid">
        <div class="card">Serviço 1</div>
        <div class="card">Serviço 2</div>
        <div class="card">Serviço 3</div>
      </div>
    </section>

    <!-- Contato -->
    <section class="contact" id="team">
      <h2>Contato</h2>
      <form>
        <input type="text" placeholder="Seu nome" />
        <input type="email" placeholder="Seu email" />
        <textarea placeholder="Sua mensagem"></textarea>
        <button type="submit">Enviar</button>
      </form>
    </section>

    <!-- Rodapé -->
    <footer class="footer">
      <p>&copy; 2025 - Seu Nome. Todos os direitos reservados.</p>
    </footer>
  </div>
</template>



<script setup lang="ts">



function scrollTo(id: string) {
  const el = document.getElementById(id)
  if (el) el.scrollIntoView({ behavior: "smooth" })
}


</script>






<style scoped>
.landing-page {
  font-family: Arial, sans-serif;
  line-height: 1.6;
}

.header {
  position: relative;
  /* necessário para posicionamento absoluto dos botões */
  display: flex;
  align-items: center;
  justify-content: center;
  /* centra os navegadores */
  padding: 24px;
}

/* Navegadores centralizados */
.navigators {
  display: flex;
  gap: 64px;
  z-index: 1;
  /* garante que fiquem acima se os botões usarem absolute */
}

/* Botões da esquerda e direita fora do fluxo do flex */
.left-button,
.signup {
  position: absolute;
  top: 50%;
  transform: translateY(-50%);
}

/* Botão da direita */
.signup {
  right: 16px;
  background-color: #ffffff;
  color: black;
  font-weight: 600;
  border-radius: 8px;
  width: 104px;
  height: 33px;
}

/* Botão da esquerda  */
.left-button {
  left: 16px;
}


.navigators button {
  background: none;
  border: none;
  color: #ffffff;
  font-weight: 400;
}

.navigators button:hover {
  font-weight: 600;
  border: none;
}


/* Banner */
.banner {
  background-size: cover;
  background-position: center;
  background-image: url("../../public/img/banner.png");
  height: 800px;
}

.slogan {
  font-size: 80px;
  margin: 0px;
}

.text-about {
  display: flex;
  flex-direction: column;
  width: 60%;
  justify-content: center;
}


.image-block {
  width: 40%;
  display: flex;
  justify-content: center;
  align-items: center;
}

.image-block img {
  width: 300px;
  height: 300px;
  display: block;
}

/* Sobre */
.about,
.services,
.contact {
  padding: 3rem 3rem;
  margin: 16 auto;
  display: flex;
  width: 100%;
}

/* Grid de serviços */
.grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
  gap: 1.5rem;
  margin-top: 1.5rem;
}

.card {
  background: #f5f5f5;
  border-radius: 0.75rem;
  padding: 2rem;
  text-align: center;
  transition: transform 0.2s;
}

.card:hover {
  transform: translateY(-4px);
}

/* Contato */
.contact form {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}

.contact input,
.contact textarea {
  padding: 0.75rem;
  border-radius: 0.5rem;
  border: 1px solid #ccc;
}

.contact button {
  padding: 0.75rem;
  border: none;
  background: #357abd;
  color: white;
  font-weight: bold;
  border-radius: 0.5rem;
  cursor: pointer;
}

.contact button:hover {
  background: #285a8c;
}

/* Rodapé */
.footer {
  text-align: center;
  padding: 1.5rem;
  background: #222;
  color: #bbb;
}
</style>
