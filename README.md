# PERGUNTAS E RESPOSTAS 

### Explique com suas palavras o que é Spring Security
R = Spring Security é um módulo dentro do Java, responsável por cuidar da parte da segurança. Ou seja, login, logoff, tokens, autenticação e/ou bloqueio de endpoints.


### Para que serve o método csrf().disable()?
R = O método csrf().disable() basicamente desativa a proteção CSRF, para que o spring não bloqueie requisições (PUT, POST, DELETE, GET).


### Explique o que significa SessionCreationPolicy.STATELESS.
R = 'SessionCreationPolicy.STATELESS' significa que configuramos a aplicação para não guardar login em sessão, ou seja, o server não vai criar nem guardar sessão de usuário.


###  Qual a função do permitAll()?
R = A função permitAll() define que qualquer pessoa pode acessar essa rota, qualquer um pode dar get e post. Sem isso, o Spring Security provavelmente exige autenticação.


### Explique o que faz o requestMatchers().
R = RequestMatchers permite que eu escolha quais rotas aquela regra de segurança vai afetar. Exemplo, defini a rota `GET/tarefas` liberada para todos.


### Qual a função do anyRequest().authenticated()?
R = A função .anyRequest() define que qualquer outra rota que eu não defini nesse bloco, necessita estar logado (exemplo, post, delete, vão estar bloqueados).


### O que é uma API Stateless?
R = É uma interface de programação onde o servidor não armazena nenhuma informação ou histórico sobre as requisições anteriores, usado principalmente em sistemas mais modernos. 


### Explique o que a lambda abaixo faz: session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
R = Configura para não guardar login em sessão, ou seja, o server não vai criar nem guardar sessão de usuário. Agora o lambda em si é só uma forma mais curta de criar uma função. 
