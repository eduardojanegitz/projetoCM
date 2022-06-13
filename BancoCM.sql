DROP DATABASE IF EXISTS BancoCM;

CREATE DATABASE BancoCM;
-- CREATE USER 'adminteste'@'%' IDENTIFIED BY '123';
-- GRANT ALL ON *.* TO 'adminteste'@'%' WITH GRANT OPTION;
-- FLUSH PRIVILEGES;

USE BancoCM;

/***** TABELA CLIENTES *****/
CREATE TABLE tb_clientes (
  id 			INT PRIMARY KEY AUTO_INCREMENT, 
  nome 			VARCHAR(100),
  rg 			VARCHAR(30),
  cpf 			VARCHAR(20),
  email 		VARCHAR(200),
  telefone 		VARCHAR(30),
  celular 		VARCHAR(30),
  cep 			VARCHAR(100),
  endereco 		VARCHAR(255),
  numero 		INT,
  complemento 	VARCHAR(200),
  bairro 		VARCHAR(100),
  cidade 		VARCHAR(100),
  estado 		VARCHAR(2)
);
/*****************/


/***** TABELA MERCADOS *****/
CREATE TABLE tb_mercados (
  id 			INT PRIMARY KEY AUTO_INCREMENT,
  nome 			VARCHAR(100),
  cnpj 			VARCHAR(100),
  email 		VARCHAR(200),
  telefone 		VARCHAR(30),
  celular 		VARCHAR(30),
  cep 			VARCHAR(100),
  endereco 		VARCHAR(255),
  numero 		INT,
  complemento 	VARCHAR(200),
  bairro 		VARCHAR(100),
  cidade 		VARCHAR(100),
  estado 		VARCHAR(2)
);
/*****************/



/***** TABELA USUÁRIO *****/
CREATE TABLE tb_usuario (
  id INT PRIMARY KEY AUTO_INCREMENT,
  usuario VARCHAR(50),
  senha VARCHAR(30),
  acesso VARCHAR(20)
);
/*****************/



/***** TABELA PRODUTOS *****/
CREATE TABLE tb_produtos (
  id int auto_increment primary key,
  nomeProduto VARCHAR(60),
  descricao varchar(100),
  preco decimal (10,2),
  qtd_estoque int,
  for_id int,

  FOREIGN KEY (for_id) REFERENCES tb_mercados(id)
);
/*****************/

/***** TABELA VENDAS *****/
CREATE TABLE tb_vendas (
  id int auto_increment primary key,
  cliente_id int,
  data_venda date,
  total_venda decimal (10,2),
  observacoes text,

  FOREIGN KEY (cliente_id) REFERENCES tb_clientes(id)
);


/*****************/

/***** TABELA ITENS_VENDAS *****/
CREATE TABLE tb_itensvendas (
  id int auto_increment primary key,
  venda_id int,
  produto_id int,
  qtd int,
  subtotal decimal (10,2),

  FOREIGN KEY (venda_id) REFERENCES tb_vendas(id),
  FOREIGN KEY (produto_id) REFERENCES tb_produtos(id)
);
/*****************/

INSERT INTO tb_produtos VALUES (null, 'Leite', 'Leite Mococa 1L', 2.79, 100, 1);
INSERT INTO tb_produtos VALUES (null, 'Óleo', 'Óleo de Oliva', 7.29, 100, 1);
INSERT INTO tb_produtos VALUES (3, 'Energético Monster', 'Energético', 7.49, 100, 1);
insert into tb_mercados values (null, 'Confiança', '12151515', 'confiança@gmail.com', '11111', '1111	1', '211', 'Rua', 23, 'N', 'dn', 'Sorocaba', 'SP');

SELECT * FROM tb_clientes;
select * from tb_produtos;
select * from tb_mercados;
select * from tb_usuario;
SELECT * from tb_vendas;
SELECT * FROM tb_itensvendas;
select date_format(data_venda, '%d/%m/%Y') from tb_vendas where data_venda = '2022-05-29';
SELECT i.id, i.qtd, p.nomeProduto, p.preco, i.subtotal FROM tb_itensvendas AS i INNER JOIN tb_produtos AS p ON(i.produto_id = p.id) WHERE i.venda_id = 1;
SELECT v.id, date_format(v.data_venda,'%d/%m/%Y'), c.nome, v.total_venda, v.observacoes FROM tb_vendas AS v INNER JOIN tb_clientes AS c ON v.cliente_id = c.id WHERE v.data_venda BETWEEN '2022-05-28' AND '2022-05-29';