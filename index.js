/*banner texto supeior*/
const texto = document.getElementById("text-top");
const arregloTextos = [
  "ENVÍO A TODO EL PERÚ 🚚",
  "ENVÍOS GRATIS",
  "DESCUENTOS DE LOCURAS",
];
const bannerTexto = () => {
  arregloTextos.forEach((textos, indice) => {});
};

/*Slider*/
const initSlider = () => {
  const cardContent = document.querySelector(".slider-wrapper .card-content");
  const buttons = document.querySelectorAll(".slider-wrapper .slider-arrow");

  //hacer la traslacion cada qeu presionamos el botn
  buttons.forEach((button) => {
    button.addEventListener("click", () => {
      const direction = button.id === "prev" ? -1 : 1;
      const scrollAmount = cardContent.clientWidth * direction;
      cardContent.scrollBy({ left: scrollAmount, behavior: "smooth" });
    });
  });
};
window.addEventListener("load", initSlider);
