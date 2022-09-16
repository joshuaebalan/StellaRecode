#ifndef STELLA_H
#define STELLA_H

/* #includes */
#include <assert.h>
#include <malloc.h>

/* Functions */
int create_flow(float, void*);
int create_resevoir(float);
int create_constant(float, void*);
int LINK_TO(void *, void*);
int function_builder();

/* Structures */
typedef struct resevoir_t {
  float VALUE; //CURRENT amount in the resevoir;
  FLOW **FLOWS_IN; //Array of all POSITIVE flows into the resevoir
  FLOW **FLOWS_OUT; //Array of all NEGATIVE flows out of the resevoir
  void *NET_FLOW; //Function of the net flow affecting this resevoir
} RESEVOIR;

typedef struct flow_t {
  float THROUGH_RATE; //Constant rate of flow if applicable
  void *FLOW_FUNCT; // Function of rate of flow in seconds
} FLOW;

typedef struct tree_t {
  float value;
  struct tree_t *L_NODE;
  struct tree_t *R_NODE;
} TREE_NODE;

typedef struct constant_t {
  float value;
  void * VALUE_FUNCT;
  struct flow_t** CONNECTED_FLOWS;
  struct resevoir_t** CONNECTED_RESEVOIRS;
} CONSTANT; 
/* Constants */
FLOW **FLOW_LIST; //List of all flows in the scheme
RESEVOIR **RESEVOIR_LIST; //List of all resevoirs in this scheme
#define DONE (0);
#define ERR (-1);
#endif //STELLA_H
