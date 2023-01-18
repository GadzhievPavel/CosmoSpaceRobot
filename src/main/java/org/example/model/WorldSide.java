package org.example.model;

public enum WorldSide implements IRotatable {
    North{
        @Override
        public WorldSide rotateLeft(){
            return West;
        }
        @Override
        public WorldSide rotateRight(){
            return East;
        }
    },East{
        @Override
        public WorldSide rotateLeft(){
            return North;
        }
        @Override
        public WorldSide rotateRight(){
            return South;
        }
    },South{
        @Override
        public WorldSide rotateLeft(){
            return East;
        }
        @Override
        public WorldSide rotateRight(){
            return West;
        }
    },West{
        @Override
        public WorldSide rotateLeft() {
            return South;
        }

        @Override
        public WorldSide rotateRight() {
            return North;
        }
    }
}