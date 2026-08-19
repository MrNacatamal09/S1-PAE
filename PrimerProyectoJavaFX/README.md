Ventana Inicial

┌──────────────────────────────────────────┐
│ Universidad Americana                    │
├──────────────────────────────────────────┤
│                                          │
│  Bienvenido a mi primer programa...     │
│                                          │
│  Dime tu nombre                           │
│  ┌────────────────────────────────────┐  │
│  │                                    │  │
│  └────────────────────────────────────┘  │
│                                          │
│  [ Guardar ]                             │
│                                          │
└──────────────────────────────────────────┘

Label → texto
TextField → campo donde el usuario escribe
Button → botón
VBox → contenedor que organiza componentes
Scene → contenido que estará dentro de la ventana
Stage → la ventana

STAGE
┌──────────────────────────────┐
│          SCENE               │
│                              │
│       ┌──────────────┐       │
│       │    VBox      │       │
│       │              │       │
│       │ Label        │       │
│       │ Label        │       │
│       │ TextField    │       │
│       │ Button       │       │
│       └──────────────┘       │
│                              │
└──────────────────────────────┘

package indica dónde pertenece nuestra clase dentro de la estructura del proyecto.

VBox root = new VBox();
Label lblTitulo = new Label(...);
Label lblName = new Label(...);
TextField tfName = new TextField();
Button btnGuardar = new Button(...);
Scene scene = new Scene(...);