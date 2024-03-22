select number, round(inventory + 0.01 * inventory) as with_spare_parts
from lego_set;
