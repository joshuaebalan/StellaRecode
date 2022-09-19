#ifndef STELLA_H
#define STELLA_H

/* Preprocessor Stuff */
#include <assert.h>
#include <malloc.h>
#include <string.h>
#define OK            (0)
#define ERR           (-1)
#define BAD_PARAM     (-2)
#define FLO           (1)
#define CONST         (2)
#define RES           (3)
#define MAX_NAME      (100)
#define CONST>RES
#define FLOW>RES


/* Functions */
int create_flow(void*, char*);
int create_resevoir(float, char*);
int create_constant(float, void*, char*);
int LINK_TO(void *, void*, MODE);
int function_builder();
int add(void*, int);
/* Structures */
typedef struct resevoir_t {
  char *NAME;
  float VALUE; //CURRENT amount in the resevoir;
  struct flow_t **FLOWS_IN; //Array of all POSITIVE flows into the resevoir
  struct flow_t **FLOWS_OUT; //Array of all NEGATIVE flows out of the resevoir
  void *NET_FLOW; //Function of the net flow affecting this resevoir
  struct constant_t **CONNECTED_CONSTANTS;
} RESEVOIR;

typedef struct flow_t {
  char *NAME;
  void *FLOW_FUNCT; // Function of rate of flow in seconds
  struct resevoir_t **CONNECTED_RESEVOIRS;
  struct constant_t **CONNECTED_CONSTANTS;
} FLOW;

typedef struct tree_t {
  float value;
  struct tree_t *L_NODE;
  struct tree_t *R_NODE;
} TREE_NODE;

typedef struct constant_t {
  char *NAME;
  float value;
  void * VALUE_FUNCT;
  struct flow_t** CONNECTED_FLOWS;
  struct resevoir_t** CONNECTED_RESEVOIRS;
} CONSTANT; 
/* Constants */
struct flow_t **FLOW_LIST; //Array of all flows in the scheme
struct resevoir_t **RESEVOIR_LIST; //Array of all resevoirs in this scheme
struct constant_t **CONSTANT_LIST; //Array of all resevoirs in this scheme
#endif //STELLA_H
