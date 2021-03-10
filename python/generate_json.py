import json
import os

blockName = input("Enter Block Name: ")
roman = 'i','ii','iii','iv',['v'],

def makeDirecteries():
    try:
        os.mkdir("assets/")
        os.mkdir("assets/compressed/")
        os.mkdir("assets/compressed/blockstates")
        os.mkdir("assets/compressed/models")
        os.mkdir("assets/compressed/models/block")
        os.mkdir("assets/compressed/models/item")
        os.mkdir("data/")
        os.mkdir("data/compressed")
        os.mkdir("data/compressed/loot_tables")
        os.mkdir("data/compressed/loot_tables/blocks")
        os.mkdir("data/compressed/recipes")
        os.mkdir("data/compressed/recipes/"+blockName)
    except OSError:
        print ("Creation of the directory %s failed")

makeDirecteries()

#blockstates
for x in range(4):
    blockstates = {
      "variants": {
        "": { "model": "compressed:block/"+ blockName +"_"+ str(roman[x])}
      }
    }
    with open('assets/compressed/blockstates/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(blockstates, outfile)
#block models
for x in range(4):
    block = {
      "parent": "block/cube_all",
      "textures": {
        "all": "compressed:blocks/"+ blockName +"_"+ str(roman[x])
      }
    }
    with open('assets/compressed/models/block/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(block, outfile)
#block item models
for x in range(4):
    items = {
        "parent": "compressed:block/"+ blockName +"_"+ str(roman[x])
    }
    with open('assets/compressed/models/item/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(items, outfile)
#loot_tables block
for x in range(4):
    loot_tables = {
        "type": "minecraft:block",
        "pools": [
          {
            "rolls": 1,
            "entries": [
              {
                "type": "minecraft:item",
                "name": "compressed:"+ blockName +"_"+ str(roman[x])
              }
            ],
            "conditions": [
              {
                "condition": "minecraft:survives_explosion"
              }
            ]
          }
        ]
      }
    with open('data/compressed/loot_tables/blocks/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(loot_tables, outfile)

#recipies
for x in range(3):
    recipeUp = {
      "type": "minecraft:crafting_shaped",
      "pattern": [
        "###",
        "###",
        "###"
      ],
      "key": {
        "#": {
          "item": "compressed:"+ blockName +"_"+ str(roman[x])
        }
      },
      "result": {
        "item": "compressed:"+ blockName +"_"+ str(roman[x+1]),
        "count": 1
      }
    }
    recipeDown = {
      "type": "minecraft:crafting_shapeless",
      "ingredients": [
        {
          "item": "compressed:"+ blockName +"_"+ str(roman[x+1])
        }
      ],
      "result": {
        "item": "compressed:"+ blockName +"_"+ str(roman[x]),
        "count": 9
      }
    }
    with open("data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[x]) + "_to_" + blockName+"_" + str(roman[x+1]) + '.json', 'w') as outfile:
        json.dump(recipeUp, outfile)
    with open("data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[x+1]) + "_to_" + blockName+"_" + str(roman[x]) + '.json', 'w') as outfile:
        json.dump(recipeDown, outfile)


CompressedOne = {
  "type": "minecraft:crafting_shaped",
  "pattern": [
    "###",
    "###",
    "###"
  ],
  "key": {
    "#": {
      "item": "minecraft:"+ blockName
    }
  },
  "result": {
    "item": "compressed:"+ blockName +"_"+ str(roman[0]),
    "count": 1
  }
}

CompressedOneDown = {
  "type": "minecraft:crafting_shapeless",
  "ingredients": [
    {
      "item": "compressed:"+ blockName +"_"+ str(roman[0])
    }
  ],
  "result": {
    "item": "minecraft:"+ blockName,
    "count": 9
  }
}
with open("data/compressed/recipes/"+blockName+"/" + blockName+ "_to_" + blockName+"_" + str(roman[0]) + '.json', 'w') as outfile:
    json.dump(CompressedOne, outfile)
with open("data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[0]) + "_to_" + blockName + '.json', 'w') as outfile:
    json.dump(CompressedOneDown, outfile)
