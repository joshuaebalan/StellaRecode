#include "StellaRecode.h"
/**
 * Initializes a new RESEVOIR object, given a provided initial value.
 * WARNING: AFTER EXECUTING, THIS RESEVOIR EXISTS BUT IS NOT CONNECTED TO ANYTHING!
 * For all properties of a RESEVOIR, see README.md or StellaRecode.h.
 */

int create_resevoir(float new_value) {
  RESEVOIR *new_resevoir = malloc(28);
  assert(new_resevoir != NULL);
  new_resevoir->VALUE = new_value;
  new_resevoir->FLOWS_IN = NULL;
  new_resevoir->FLOWS_OUT = NULL;
  new_resevoir->NET_FLOW = NULL;
  //int x = add(new_resevoir, RES);
  return OK;
}

/**
 * Initializes a new CONSTANT object, given a provided value and constant rate.
 * WARNING: AFTER EXECUTING, THIS CONSTANT EXISTS BUT IS NOT CONNECTED TO ANYTHING!
 * For all properties of a CONSTANT, see README.md or StellaRecode.h.
 */

int create_constant(float new_value, void *custom_rate) {
  CONSTANT *new_const = malloc(28);
  assert(new_const != NULL);
  new_const->value = new_value;
  new_const->CONNECTED_FLOWS = NULL;
  new_const->CONNECTED_RESEVOIRS = NULL;
  new_const->VALUE_FUNCT = custom_rate;
  //int x = add(custom_rate, CONST);
  return OK;
}

/**
 * Adds a new structure to an array of structures, compatible with all types..
 */


/*
int add(void *new, int mode) {
  if (mode == CONST) {
    CONSTANT* selected_offset = CONSTANT_LIST[0];
    CONSTANT** master = CONSTANT_LIST;
    CONSTANT* addition = (CONSTANT*) new;
  }
  else if (mode == FLO) {
    FLOW* selected_offset = FLOW_LIST[0];
    FLOW** master = FLOW_LIST;
    FLOW *addition = (FLOW*) new;
  }
  else if (mode == RES) {
    RESEVOIR* selected_offset = RESEVOIR_LIST[0];
    RESEVOIR** master = RESEVOIR_LIST;
    RESEVOIR* addition = (RESEVOIR*) new;
  }
  else {
    return BAD_PARAM;
  }  
  int i = 0;
  while (selected_offset != NULL) {
    i++;
    selected_offset = master[i];
  }
  master[i] = addition;
  return OK;
} */

/**
 * Initializes a new FLOW object, given a flow rate(represented by a binary tree) determined by the string interpreter function.
 * WARNING: AFTER EXECUTING THIS FLOW EXISTS BUT IS NOT CONNECTED TO ANYTHING!
 * For all properties of a FLOW, please see README.md or StellaRecode.h.
 */

int create_flow(void *flow_rate) {
  FLOW *new_flow = malloc(8);
  assert(new_flow != NULL);
  new_flow->FLOW_FUNCT = flow_rate;
  //int x = add(new_flow, FLOW); 
  return OK;
}

