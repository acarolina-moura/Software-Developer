function mudarTitulo() {
        const e = document.getElementById("titulo-inicial");

        e.innerText = "Titulo Modificado";
        e.style.color = "orange";
        e.style.backgroundColor = "lightgray";
        e.style.fontSize = "3rem";
}
      
function interruptor() { 
  const lampada = document.getElementById("interruptor");
  //lampada.classList.add("luz-acesa");

  // if (lampada.classList.contains("luz-acesa")) {
  //   lampada.classList.remove("luz-acesa");
  // } else {
  //   lampada.classList.add("luz-acesa");
  // }

  lampada.classList.toggle("luz-acesa");
}

function mudaIsto() {
  //alert("Estou à escuta");
  console.log(this.innerHTML);
  this.innerText += " Clicaste-me!";

}

const escuta = document.querySelector("#escuta");
escuta.addEventListener("click", mudaIsto);

//SOMAR NÚMEROS

document.querySelector("#somar").addEventListener("click", somarNumeros);

function somarNumeros() {
  const num1 = parseInt(document.querySelector("#num1").value);
  const num2 = parseInt(document.querySelector("#num2").value);
  const resultado = document.querySelector("#resultado");
  console.log("A somar numeros...", typeof num1, typeof num2);

  //const soma = num1 + num2;
  soma = calculadora(num1, num2, "somar")
  resultado.value = soma;
}

function calculadora(num1, num2, operacao ) {
  if (operacao === "somar") {
    return num1 + num2;
  }
}