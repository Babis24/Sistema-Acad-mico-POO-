# Sistema de Gerenciamento Acadêmico

Este é um sistema simples de gerenciamento acadêmico desenvolvido em Java. O projeto permite o cadastro e a manipulação de Períodos, Cursos e Disciplinas através de um menu interativo no console.

## Funcionalidades

O sistema é dividido em três módulos principais:

### Períodos
- **Adicionar:** Cadastra um novo período no sistema.
- **Alterar:** Modifica as informações de um período existente.
- **Excluir:** Remove um período do sistema.
- **Pesquisar:** Busca um período específico pelo seu código.
- **Listar Todos:** Exibe todos os períodos cadastrados.
- **Contar Cadastros:** Mostra o número total de períodos cadastrados.

### Cursos
- **Adicionar:** Cadastra um novo curso no sistema.
- **Alterar:** Modifica as informações de um curso existente.
- **Excluir:** Remove um curso do sistema.
- **Pesquisar:** Busca um curso específico pelo seu código.
- **Listar Todos:** Exibe todos os cursos cadastrados.
- **Contar Cadastros:** Mostra o número total de cursos cadastrados.

### Disciplinas
- **Adicionar:** Cadastra uma nova disciplina no sistema.
- **Alterar:** Modifica as informações de uma disciplina existente.
- **Excluir:** Remove uma disciplina do sistema.
- **Pesquisar:** Busca uma disciplina específica pelo seu código.
- **Listar Todos:** Exibe todas as disciplinas cadastradas.
- **Contar Cadastros:** Mostra o número total de disciplinas cadastradas.

## Como Executar o Projeto

Para compilar e executar o projeto, siga os passos abaixo:

1. **Pré-requisitos:**
   - É necessário ter o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) instalado em sua máquina.

2. **Compilação:**
   - Abra um terminal ou prompt de comando na pasta raiz do projeto.
   - Execute o seguinte comando para compilar todos os arquivos `.java`:
     ```bash
     javac *.java
     ```

3. **Execução:**
   - Após a compilação, execute o programa com o seguinte comando:
     ```bash
     java SysAcad
     ```
   - O menu principal do sistema será exibido no console.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `SysAcad.java`: Classe principal que inicia a aplicação.
- `SysAcadMenu.java`: Gerencia o menu principal e a navegação entre os módulos.
- `Periodo.java`, `Curso.java`, `Disciplina.java`: Classes de modelo que representam as entidades do sistema.
- `PeriodoBanco.java`, `CursoBanco.java`, `DisciplinaBanco.java`: Classes responsáveis por armazenar e gerenciar os dados em memória (usando `ArrayList`).
- `PeriodoMenu.java`, `CursoMenu.java`, `DisciplinaMenu.java`: Classes que controlam os menus e a interação do usuário para cada módulo.
