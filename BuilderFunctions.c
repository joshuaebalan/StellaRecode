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
  RESEVOIR *selected_offset = RESEVOIR_LIST[0];
  int i = 0;
  while (selected_offset != NULL) {
    i++;
    selected_offset = RESEVOIR_LIST[i];
  }
  RESEVOIR_LIST[i] = new_resevoir;
  return OK;
}

/**
 * Initializes a new CONSTANT object, given a provided value and constant rate.
 * WARNING: AFTER EXECUTING, THIS CONSTANT EXISTS BUT IS NOT CONNECTED TO ANYTHING!
 * For all properties of a CONSTANT, see README.md or StellaRecode.h.
 */

int create_constant(float val; void *custom_rate) {
  CONSTANT *new_const = malloc(28);
  assert(new_const != NULL);
  new_const->value = val;
  new_const->CONNECTED_FLOWS = NULL;
  new_const->CONNECTED_RESEVOIRS = NULL;
  new_const->VALUE_FUNCT = custom_rate;
  CONSTANT* selected_offset = CONSTANT_LIST[0];
  int i = 0;
  while (selected_offset != NULL) {
    i++;
    selected_offset = CONSTANT_LIST[i];
  }
  CONSTANT_LIST[i] = new_const;
  return OK;
}


