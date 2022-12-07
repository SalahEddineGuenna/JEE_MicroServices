-------------------------Activité pratique du controle-------------------------------------------------------------
Objectif :  
Créer une application basée sur une architecture micro-service qui permet de gérer les factures contenant des produits et appartenant à un client.

1.Créer le micro-service customer-service qui permet de gérer les client :

![customers](https://user-images.githubusercontent.com/75700746/206162799-f457401a-22ed-43d5-835e-e601a485020b.PNG)

2.Créer le micro-service inventory-service qui permet de gérer les produits

![cgatway](https://user-images.githubusercontent.com/75700746/206163097-2218a1b1-0f6d-4685-9f62-9e8351603024.PNG)

3. Créer la Gateway Spring cloud Gateway avec une Configuration statique du système de routage

![cid](https://user-images.githubusercontent.com/75700746/206163728-93f69685-026a-404e-b198-ef58cc78c545.PNG)

4. Créer l'annuaire Eureka Discrovery Service

![euroka](https://user-images.githubusercontent.com/75700746/206163813-2c052aef-3a12-462b-8ae6-6df706341a5d.PNG)

6. Créer le service de facturation Billing-Service en utilisant Open Feign

![Capture](https://user-images.githubusercontent.com/75700746/206163976-a1e54bb6-bc3c-4285-ba2c-ea25df3a55fa.PNG)

7. Créer un client Web Angular (Clients, Produits, Factures)

Produits :

![products](https://user-images.githubusercontent.com/75700746/206164112-a32272a1-0bdd-4490-ab42-6edb41998dd1.PNG)

Customers :

![cutomers](https://user-images.githubusercontent.com/75700746/206164177-5545d2be-f01e-48a7-95b4-3c32fc9800e1.PNG)


8. Déployer le serveur keycloak :


  Créer un Realm
     
  ![keycklock2](https://user-images.githubusercontent.com/75700746/206164353-309b94be-46c7-4657-b42b-d20998548ea9.PNG)

  Créer un client à sécuriser
      
   ![image](https://user-images.githubusercontent.com/75700746/206164864-ad12a066-ee00-44ed-b195-00d6332d2fa3.png)


   Créer des utilisateurs 
      
  ![image](https://user-images.githubusercontent.com/75700746/206164911-08c20f28-03f4-4d32-aa60-1fd09575a9fa.png)
  
   Créer des rôles
        
   ![image](https://user-images.githubusercontent.com/75700746/206164977-3705c0fb-99eb-4eb5-8f04-96c077f19c90.png)
        
  - Affecter les rôles aux utilisateurs
        
   ![image](https://user-images.githubusercontent.com/75700746/206165181-27251051-3198-4f33-80c6-15b3732003c8.png)


  -Tester les différents modes d'authentification avec Postman en montrant les contenus de Access-Token, Refresh Token 
         
  ![image](https://user-images.githubusercontent.com/75700746/206165354-bb107929-7f0c-4fd3-9129-a2af4f0d88c5.png)
         
         
  ![image](https://user-images.githubusercontent.com/75700746/206165416-4566a031-3a20-4085-b29a-2b3af76b558c.png)
        
        
  9. Sécuriser les micro-services et le frontend angular en déployant les adaptateurs Keycloak
          
   ![image](https://user-images.githubusercontent.com/75700746/206165540-79677e25-605c-4104-98d3-4d72e35adcbb.png)
            
            
  ![products](https://user-images.githubusercontent.com/75700746/206165669-4d2e8dd5-8891-4e4e-98f5-7bc9edce6d53.PNG)


          
          

      
      
