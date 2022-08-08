FROM gitpod/workspace-java-17

RUN sudo apt-get update -qq && \
    DEBIAN_FRONTEND=noninteractive sudo apt-get install -y \
    graphviz \
    && sudo apt-get clean \
    && sudo rm -rf /var/lib/apt/lists/*
