# 🏢 Sistema para Imobiliária – Regras e Estrutura de Classes

Este trabalho propõe o desenvolvimento de um sistema para uma **imobiliária** que realiza **vendas** e **locações de imóveis**.  
O sistema deve lidar com diferentes **tipos de imóveis**, **contratos**, **comissões** e **regras contratuais**.

---

## 📦 Estrutura de Classes

### 1. `Imóvel` (classe abstrata)
- **Atributos**:
  - `endereço`
  - `valor base`
  - `valor do IPTU`
- **Métodos abstratos**:
  - `calcularTaxaAdministracao()`

---

### 2. 🏘️ Tipos de Imóveis
- **Residencial**
- **Comercial**
- **Misto**
- **Industrial**

Cada tipo possui **regras específicas** de **taxa de administração**.

---

### 3. 👤 Proprietários (Locadores)
- Podem possuir **mais de um imóvel**.
- Um imóvel pode ter **vários proprietários**, cada um com um **percentual de participação**.
- Os aluguéis são **distribuídos proporcionalmente** a esses percentuais.

---

### 4. 👥 Locatários
- Pessoas que **alugam os imóveis**.
- Devem pagar:
  - **Aluguel**
  - **IPTU**
- **Pagamento em atraso** gera **multa**.

---

### 5. 🧑‍💼 Corretores
- Atuam **apenas na venda** de imóveis.
- Recebem **comissão sobre o valor da venda**.

---

### 6. 🏢 Imobiliária
- **Cobra**:
  - Uma **taxa sobre aluguel** (administração).
  - Uma **comissão sobre venda**.
- **Realiza**:
  - Contratos de **locação** e **venda**.
  - Encaminha **relatórios mensais à Receita Federal** (simulado via `print` no console).

---

### 7. 📄 `Contrato` (classe abstrata)
- **Possui**:
  - `imóvel`
  - `data de início`
  - `valor principal`
- **Métodos abstratos**:
  - `calcularEncargosMensais()`

---

### 8. 📃 `ContratoLocacao`
- **Envolve**:
  - `locatário`
  - `locadores`
  - `multa por atraso`
  - `valor mensal`
- **Pagamento**:
  - **Em atraso**: adiciona multa e registra como **devedor**.
  - Inclui **IPTU pago pelo inquilino**.
- **Vistoria**:
  - Feita na entrega do imóvel.
  - O proprietário aprova ou exige **reparos** (simulado).
- Contrato pode ser **encerrado** com ou sem **multa**.

---

### 9. 📑 `ContratoVenda`
- **Envolve**:
  - `comprador`
  - `vendedor(es)`
  - `corretor`
  - `valor`
- **Repartição do valor**:
  - Entre a **imobiliária** e o **corretor**.

---

## ⚖️ Regras de Negócio

- A imobiliária **só paga comissão ao corretor em vendas**.
- Em locações:
  - Cobra uma **taxa mensal**.
  - **Pagamento em atraso**: multa e registro de devedor.
  - Inquilino paga o **IPTU mensalmente**.
- Um imóvel pode ter **vários proprietários** com percentuais distintos.
- O **valor do aluguel é dividido** conforme os percentuais.
- No **fim do contrato de locação**:
  - Realiza-se **vistoria**.
  - Se houver **danos**, o inquilino realiza os **reparos**.

---

## 🧾 Outras Classes Necessárias

- Classe que gerencia **devedores**.
- A imobiliária mantém listas de:
  - Imóveis
  - Contratos
  - Corretores
  - Locadores
  - Locatários
  - Devedores

---

## ✅ Funcionalidades

- **Cadastrar**:
  - Locadores
  - Locatários
  - Corretores
  - Imóveis
- **Realizar locação** com:
  - Valor mensal
  - IPTU
  - Controle de atraso
  - Cálculo da multa
  - Registro de devedores
- **Realizar venda** com:
  - Comissão da imobiliária
  - Comissão do corretor
  - Repartição do valor entre proprietários
- **Encerrar contratos de locação** com vistoria.

---

## 🔍 Consultas

- Quantos **imóveis** um locador possui.
- **Valor total devido** por devedores.

---

## 🖨️ Relatórios

- Lista de devedores.
- Repasse de valores a locadores.
- Valores recebidos pela imobiliária.
- Envio de **"informações à Receita Federal"** (print no console).

---
