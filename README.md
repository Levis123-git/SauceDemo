# 💻 Projeto de Automação de Testes Sauce Demo V1

Este repositório contém a automação de testes de ponta a ponta (E2E) para o sistema **SauceDemo**, utilizando a ferramenta [Selenium](https://www.selenium.dev/)


## 📋 Descrição

O objetivo deste projeto é garantir a qualidade das funcionalidades principais do sistema, testando cenários críticos como login, navegação, preenchimento de formulários, e validação de mensagens de erro e sucesso.

Os testes seguem boas práticas de automação e possuem foco em:

- Verificação de fluxo de login;

## 🛠️ Tecnologias e Ferramentas

- **Selenium**: Framework para automação de testes de E2E;
- **Java**: Linguagem utilizada nos scripts de teste;
- **JUnit**: Ambiente de execução do JavaScript;
- **Maven**: Gerenciador de pacotes.


## 🚀 Como Executar o Projeto

###  📌Pré-requisitos

Certifique-se de ter instalado:

- JUnit (Versão 5 ou mais atuail)
- Maven 

### 👨🏻‍💻 Passos para Configuração

 1. Clone o repositório:
 ```bash
	git clone https://github.com/Levis123-git/Projeto-Automacao-UI-ROTA361-.git 
```
 2. Entrar na pasta do projeto clonado:
 ```bash
	cd automacao_sauceDemo
```
3. Instale as dependências:
 ```bash
	Maven install
```


## 🧪 Testes Implementados

### Testes de Login

-   **Login realizado com sucesso**:
	-  Preenche os dados de login válidos e verifica a mensagem de sucesso.
	-  Garante que o usuário foi redirecionado corretamente.
        
-   **Não deve logar quando senha inválida**:    
	-  Tenta logar com senha incorreta e valida a mensagem de erro exibida.

-  **Não deve logar quando usuário bloqueado**:    
	-  Tenta logar com senha usuário bloqueado e valida a mensagem de erro exibida.
      
-   **Não deve logar quando dados em branco**:
	 - Tenta logar sem preecnher credenciais e valida a mensagem obrigatóriedade dos campos.
		   
    
    

## 📦 Dependências Principais

As principais dependências do projeto são:

-   [Selenium](https://www.selenium.dev/): Framework de testes.
-   [Maven](https://maven.apache.org/): Gerenciador de pacotes.



##  📂 Estrutura do Projeto

A organização do projeto segue a estrutura padrão recomendada pelo Cypress:

 ```bash
src/test/Java/
├── Drivers/					# Arquivo de Drivers do selenium
├── Elementos/        # Arquivos de Elementos WEB
├── Metodos/          # Arquivos de metodos de teste (Ações executáveis)
├── Pages/            # Arquivo de Pagina Web, todos os elementos que compôe aquela funcionalidade em específico
├── Runner/          	# Executor para os testes (Antes e depois [abrir e fechar navegador])
└── Testes            # Arquivo onde fica os testes executáveis


	
```

## 📌 Notas Gerais
Feito por [Levi Alves](https://github.com/Levis123-git) 😊

Demonstração de Testes => https://drive.google.com/drive/folders/13xo6RPJfX-akPd49labGSyEr0xrLC6ks?usp=sharing



