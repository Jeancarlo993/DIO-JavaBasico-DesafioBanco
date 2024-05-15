# Desafio Banco em JAVA 
## Projeto feito para o desafio da DIO no curso básico de java. 
### Informações 
* Usei alguns aspectos da orientação a objetos e da arquitetura MVC. 
* Usei 3 classes:
  ** A classe CaixaEletrônico é o equivalente a uma view do programa, utiliza os métodos da classe de controle e da classe de modelo.  
  ** A classe TerminalDoBanco é o equivalente um controller do programa, manipulando a classe Cliente.
  ** A classe Cliente é possui a estrutura básica onde os dados são armazenados.
* Além das classes criei uma arquivo em CSV para treinar a manipulação de arquivos.
### Funcionamento
* A classe CaixaEletrônico solicitara ao usuário do programa o número da conta, usará um método da classe TerminalDoBanco para buscar o número da conta no arquivo e caso encontre criará um objeto local com as informações encontradas. A partir de então o usuário pode escolher depositar, sacar, ou ver o saldo da sua conta.
### Ideias para melhorar
* Fazer com que as modificações feitas sejam salvas do arquivo;
* Incluir método para cadastrar uma conta
* Fazer com que cada conta tenha uma senha
* Criar uma pasta com log de movimentações e uma opção para ver extrato
  
