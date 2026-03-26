# **Exercícios** sobre **modificadores de acesso (`public`, `private` e `protected`) e encapsulamento** em Java.

---

### **Lista de Exercícios - Encapsulamento e Modificadores de Acesso**

### **1️⃣ Criando uma classe com `private` e métodos `public`**

Crie uma classe `Produto` com os atributos `nome` e `preco` (ambos privados). Adicione métodos `public` para definir e obter os valores desses atributos. No programa principal, crie um objeto da classe e defina seus valores corretamente.

---

### **2️⃣ Validação de dados em métodos `set`**

Modifique a classe `Produto` do exercício anterior para que o método `setPreco(double preco)` não permita valores negativos. Caso um valor inválido seja inserido, exiba uma mensagem de erro.

---

### **3️⃣ Criando uma conta bancária com saldo protegido**

Crie uma classe `ContaBancaria` com os atributos `titular` (público) e `saldo` (privado). Implemente métodos para **depositar** e **sacar**, garantindo que um saque não ocorra se o saldo for insuficiente. O método `getSaldo()` deve permitir acessar o saldo.

---

### **4️⃣ Uso de `protected` em uma hierarquia de classes**

Crie uma classe `Veiculo` com um atributo `protected` chamado `velocidadeMaxima`. Depois, crie uma classe `Carro` que herde de `Veiculo` e adicione um método para exibir a velocidade máxima.

---

### **5️⃣ Criando uma classe `Funcionario` com `private` e `public`**

Crie uma classe `Funcionario` com atributos privados `nome` e `salario`. Adicione métodos `public` para definir e obter esses valores. No programa principal, crie um objeto e exiba os dados.

---

### **6️⃣ Controle de acesso em uma classe de login**

Crie uma classe `Usuario` com os atributos `private` `login` e `senha`. Adicione um método `public boolean autenticar(String login, String senha)` que verifica se os valores fornecidos correspondem aos armazenados.

---

### **7️⃣ Subclasse acessando atributo `protected`**

Crie uma classe `Pessoa` com um atributo `protected` chamado `idade`. Depois, crie uma classe `Aluno` que herde de `Pessoa` e crie um método que permita definir e exibir a idade do aluno.

---

### **8️⃣ Criando um sistema de controle de acesso**

Crie uma classe `Porta` com um atributo `private boolean aberta`. Adicione métodos `public` `abrir()` e `fechar()` para modificar o estado da porta, garantindo que **nenhum código externo possa alterar diretamente esse estado**.

---

### **9️⃣ Implementando um `protected` método em uma classe base**

Crie uma classe `Animal` com um método `protected` chamado `fazerSom()`. Depois, crie duas classes `Cachorro` e `Gato` que herdam de `Animal` e sobrescrevem esse método com sons diferentes. No programa principal, teste essas classes.

---

### **🔟 Criando uma classe `Carro` com encapsulamento completo**

Crie uma classe `Carro` com os atributos `marca`, `modelo` (privados) e `ano` (público). Implemente métodos `getters` e `setters` para os atributos privados e garanta que o ano do carro não possa ser menor que 1886 (ano do primeiro automóvel).
