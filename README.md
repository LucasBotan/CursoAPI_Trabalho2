﻿# CursoAPI_Trabalho2


## Chamadas aos endpoints:

* POST pedido
```
localhost:8080/api/v1/pedido

{
  "numero": 123,
  "cliente": "Jorge Ribeiro"
}
 ```

 * POST item
```
localhost:8080/api/v1/pedido/123/item

{
  "indice": 3,
  "sku": "SKU005",
  "produto": "Produto Qualquer",
  "preco": 15.99,
  "quantidade": 4
}
 ```
