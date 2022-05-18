import styles from './App.module.css';

function App() {
  return (
    <>
      <div class={styles.topnav}>
        <a class={styles.active} href="#home">Kullanıcı Bilgileri</a>
        <a href="#news">Tarifler</a>
        <a href="#contact">Yiyecekler</a>
        <a href="#contact">Program Ekle</a>
        <a href="#contact">Kullanıcı Raporları</a>
        <a href="#contact">Kullanıcı Testleri</a>
        <a href="#about">Hakkında</a>
      </div>


      <section>
    <nav>
        <ul>
            <li><a href="#">Adı: </a></li>
            <li><a href="#">Soyadı: </a></li>
            <li><a href="#">Rahatsızlık</a></li>
        </ul>
    </nav>

    <article>
        <h1>Kullanıcının</h1>
        <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
        <p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>
    </article>
</section>

      <footer>
        @ Healthy Systems
      </footer>
    </>
  );
}

export default App;
