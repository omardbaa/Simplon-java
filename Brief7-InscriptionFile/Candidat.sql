/*par un identifiant, un nom, un prénom, un mail, adresse, ville, pays*/


/*Candidat*/
Create table Candidat(
	IdCandidat int Primary key,
	NomCandidat varchar(25),
	PrenomCandidat varchar(25),
	EmailCandidat varchar(25),
	AdresseCandidat varchar(25),
	VilleCandidat varchar(25),
	PaysCandidat varchar(25)
	
);















<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ButtonBar?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.AnchorPane?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.layout.VBox?>

<AnchorPane stylesheets="@application.css" xmlns="http://javafx.com/javafx/18" xmlns:fx="http://javafx.com/fxml/1">
   <children>
      <AnchorPane layoutX="-8.0" layoutY="-26.0" prefHeight="484.0" prefWidth="771.0" styleClass="parent" stylesheets="@application.css">
         <children>
            <Pane layoutX="35.0" layoutY="47.0" prefHeight="424.0" prefWidth="726.0" styleClass="pane" AnchorPane.bottomAnchor="20.0" AnchorPane.leftAnchor="25.0" AnchorPane.rightAnchor="20.0" AnchorPane.topAnchor="40.0">
               <children>
                  <ButtonBar layoutX="546.0" layoutY="225.0" prefHeight="40.0" prefWidth="200.0" />
                <Button layoutX="549.0" layoutY="212.0" mnemonicParsing="false" prefHeight="26.0" prefWidth="111.0" styleClass="login-singup-button" stylesheets="@application.css" text="Sing In" />
                  <Label layoutX="514.0" layoutY="106.0" styleClass="Label" stylesheets="@application.css" text="Alredy have an account?" textFill="WHITE" />
                  <VBox layoutY="-51.0" prefHeight="480.0" prefWidth="340.0" styleClass="background-account" stylesheets="@application.css" />
                  <Button layoutX="56.0" layoutY="214.0" mnemonicParsing="false" prefHeight="26.0" prefWidth="111.0" styleClass="login-singup-button" stylesheets="@application.css" text="Sing up" />
                  <Label layoutX="26.0" layoutY="106.0" styleClass="Label" stylesheets="@application.css" text="You don't have account?" textFill="WHITE" />
               </children>
            </Pane>
         </children>
      </AnchorPane>
   </children>
</AnchorPane>
