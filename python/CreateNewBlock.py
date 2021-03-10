from PIL import Image
import json
import os
from os import path

imagePath = "../src/main/resources/assets/compressed/textures/blocks/"
resourcesPath = "../src/main/resources/"

blockName = input("Enter Block Name: ")
blockModelType = input("What block model type is this block? cube_all(1), cube_column(2) cube_bottom_top(3): ")
#numberOfCompression = int(input("How many compressed versions of this block: "))

roman = 'i','ii','iii','iv','v'

############IMAGE SECTION#################
compressed_i = Image.open("compressed_image_layers/compressed_i.png")
compressed_ii = Image.open("compressed_image_layers/compressed_ii.png")
compressed_iii = Image.open("compressed_image_layers/compressed_iii.png")
compressed_iv = Image.open("compressed_image_layers/compressed_iv.png")

def sideTexture():
    try:
        blockTexture = Image.open(blockName + ".png")
        Image.alpha_composite(blockTexture, compressed_i).save(imagePath+""+blockName+"_i.png")
        Image.alpha_composite(blockTexture, compressed_ii).save(imagePath+""+blockName+"_ii.png")
        Image.alpha_composite(blockTexture, compressed_iii).save(imagePath+""+blockName+"_iii.png")
        Image.alpha_composite(blockTexture, compressed_iv).save(imagePath+""+blockName+"_iv.png")
    except Exception as e:
        print("Error: unable to find a texture named " + blockName)

def topTexture():
    try:
        blockTextureTop = Image.open(blockName + "_top.png")
        Image.alpha_composite(blockTextureTop, compressed_i).save(imagePath+""+blockName+"_top_i.png")
        Image.alpha_composite(blockTextureTop, compressed_ii).save(imagePath+""+blockName+"_top_ii.png")
        Image.alpha_composite(blockTextureTop, compressed_iii).save(imagePath+""+blockName+"_top_iii.png")
        Image.alpha_composite(blockTextureTop, compressed_iv).save(imagePath+""+blockName+"_top_iv.png")
    except Exception as e:
        print("Error: unable to find a texture named " + blockName + "_top.png")
def bottomTexture():
    try:
        blockTextureTop = Image.open(blockName + "_bottom.png")
        Image.alpha_composite(blockTextureTop, compressed_i).save(imagePath+""+blockName+"_bottom_i.png")
        Image.alpha_composite(blockTextureTop, compressed_ii).save(imagePath+""+blockName+"_bottom_ii.png")
        Image.alpha_composite(blockTextureTop, compressed_iii).save(imagePath+""+blockName+"_bottom_iii.png")
        Image.alpha_composite(blockTextureTop, compressed_iv).save(imagePath+""+blockName+"_bottom_iv.png")
    except Exception as e:
        print("Error: unable to find a texture named " + blockName + "_bottom.png")


if blockModelType == "1":
    sideTexture()
elif blockModelType == "2":
    sideTexture()
    topTexture()
elif blockModelType == "3":
    print("working")
    sideTexture()
    topTexture()
    bottomTexture()


###########BLOCKSTATE####################
for x in range(4):
    blockstates = {
      "variants": {
        "": { "model": "compressed:block/"+ blockName +"_"+ str(roman[x])}
      }
    }
    with open(resourcesPath + 'assets/compressed/blockstates/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(blockstates, outfile)

###########BLOCKMODEL####################
if blockModelType == "1":
    for x in range(4):
        block = {
          "parent": "block/cube_all",
          "textures": {
            "all": "compressed:blocks/"+ blockName +"_"+ str(roman[x])
          }
        }
        with open(resourcesPath + 'assets/compressed/models/block/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
            json.dump(block, outfile)
elif blockModelType == "2":
    for x in range(4):
        block = {
          "parent": "block/cube_column",
          "textures": {
            "end": "compressed:blocks/"+ blockName +"_top_"+ str(roman[x]),
            "side": "compressed:blocks/"+ blockName +"_"+ str(roman[x])
          }
        }
        with open(resourcesPath + 'assets/compressed/models/block/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
            json.dump(block, outfile)
elif blockModelType == "3":
    for x in range(4):
        block = {
            "parent": "block/cube_bottom_top",
            "textures": {
            "top": "compressed:blocks/"+ blockName +"_top_"+ str(roman[x]),
            "bottom": "compressed:blocks/"+ blockName +"_bottom_"+ str(roman[x]),
            "side": "compressed:blocks/"+ blockName +"_"+ str(roman[x])
            }
        }
        with open(resourcesPath + 'assets/compressed/models/block/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
            json.dump(block, outfile)

##########ITEMMODEL###########
for x in range(4):
    items = {
        "parent": "compressed:block/"+ blockName +"_"+ str(roman[x])
    }
    with open(resourcesPath + 'assets/compressed/models/item/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(items, outfile)

############LOOTTABLE##########
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
    with open(resourcesPath + 'data/compressed/loot_tables/blocks/'+ blockName+"_" + str(roman[x]) +'.json', 'w') as outfile:
        json.dump(loot_tables, outfile)


#############RECIPIES##############
if not path.exists(resourcesPath + "data/compressed/recipes/"+blockName+"/"):
    os.mkdir(resourcesPath + "data/compressed/recipes/"+blockName)



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
    with open(resourcesPath +"data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[x]) + "_to_" + blockName+"_" + str(roman[x+1]) + '.json', 'w') as outfile:
        json.dump(recipeUp, outfile)
    with open(resourcesPath +"data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[x+1]) + "_to_" + blockName+"_" + str(roman[x]) + '.json', 'w') as outfile:
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
with open(resourcesPath +"data/compressed/recipes/"+blockName+"/" + blockName+ "_to_" + blockName+"_" + str(roman[0]) + '.json', 'w') as outfile:
    json.dump(CompressedOne, outfile)
with open(resourcesPath +"data/compressed/recipes/"+blockName+"/" + blockName+"_" + str(roman[0]) + "_to_" + blockName + '.json', 'w') as outfile:
    json.dump(CompressedOneDown, outfile)
